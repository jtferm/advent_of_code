require 'checksum'

RSpec.describe Checksum do
  it "matches the example" do
    ids = [
      'abcdef',
      'bababc',
      'abbcde',
      'abcccd',
      'aabcdd',
      'abcdee',
      'ababab',
    ]

    checksum = Checksum.new(ids)
    expect(checksum.compute).to eq(12)
  end
end
