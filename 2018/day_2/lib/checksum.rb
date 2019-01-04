class Checksum
  def initialize(ids)
    @box_ids = ids.map { |id| BoxID.new(id) }
  end

  def compute
    pairs = 0
    triples = 0

    @box_ids.each do |box_id|
      pairs += 1 if box_id.pair?
      triples += 1 if box_id.triple?
    end

    return pairs * triples
  end
end
